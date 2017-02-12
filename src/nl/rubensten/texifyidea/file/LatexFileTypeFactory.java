package nl.rubensten.texifyidea.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author Sten Wessel
 */
public class LatexFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumeFileType(consumer, LatexFileType.INSTANCE);
        consumeFileType(consumer, StyleFileType.INSTANCE);
        consumeFileType(consumer, ClassFileType.INSTANCE);
        consumeFileType(consumer, PdfFileType.INSTANCE);
    }

    public void consumeFileType(@NotNull FileTypeConsumer consumer, @NotNull FileType fileType) {
        consumer.consume(fileType, fileType.getDefaultExtension());
    }
}
