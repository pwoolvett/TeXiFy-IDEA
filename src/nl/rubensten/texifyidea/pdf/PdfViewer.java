package nl.rubensten.texifyidea.pdf;

import com.intellij.codeHighlighting.BackgroundEditorHighlighter;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorLocation;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VirtualFile;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.beans.PropertyChangeListener;

import static nl.rubensten.texifyidea.util.TeXiFyUtil.logf;

/**
 * @author Ruben Schellekens
 */
public class PdfViewer implements FileEditor {

    private static final String NAME = "TeXiFy PDF Viewer";

    private final VirtualFile file;
    private final JFXPanel fxPanel = new JFXPanel();
    private WebView webView;

    public PdfViewer(VirtualFile file) {
        this.file = file;

        SwingUtilities.invokeLater(this::makeWebView);
    }

    private void makeWebView() {
        Platform.runLater(this::initialiseJavaFX);
    }

    private void initialiseJavaFX() {
        Scene scene = getScene();
        fxPanel.setScene(scene);
    }

    private Scene getScene() {
        Group root = new Group();
        Scene scene = new Scene(root);

        loadFile();
        root.getChildren().add(webView);

        return scene;
    }

    private void loadFile() {
        if (webView == null) {
            webView = new WebView();
        }

        String path = "file:///" + file.getPath();
        WebEngine engine = webView.getEngine();
        engine.load(path);

        logf("Opens %s", path);
    }

    @NotNull
    @Override
    public JComponent getComponent() {
        return fxPanel;
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return fxPanel;
    }

    @NotNull
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void setState(@NotNull FileEditorState fileEditorState) {
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void selectNotify() {
        Platform.runLater(this::loadFile);
    }

    @Override
    public void deselectNotify() {
    }

    @Override
    public void addPropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {
    }

    @Override
    public void removePropertyChangeListener(@NotNull PropertyChangeListener propertyChangeListener) {
    }

    @Nullable
    @Override
    public BackgroundEditorHighlighter getBackgroundHighlighter() {
        return null;
    }

    @Nullable
    @Override
    public FileEditorLocation getCurrentLocation() {
        return null;
    }

    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder() {
        return null;
    }

    @Override
    public void dispose() {
    }

    @Nullable
    @Override
    public <T> T getUserData(@NotNull Key<T> key) {
        return null;
    }

    @Override
    public <T> void putUserData(@NotNull Key<T> key, @Nullable T t) {
    }
}
