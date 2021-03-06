package nl.rubensten.texifyidea.index;

import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.stubs.StubIndexKey;
import com.intellij.util.ArrayUtil;
import nl.rubensten.texifyidea.psi.LatexCommands;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 * @author Ruben Schellekens
 */
public class LatexCommandsIndex extends StringStubIndexExtension<LatexCommands> {

    public static final StubIndexKey<String, LatexCommands> KEY =
            StubIndexKey.createIndexKey("nl.rubensten.texifyidea.commands");

    private static final Pattern PRECEDING_SLASH = Pattern.compile("^\\\\");

    /**
     * Get all the indexed LaTeX commands in a given scope.
     */
    @NotNull
    public static Collection<LatexCommands> getIndexedCommands(@NotNull Project project,
                                                               @NotNull GlobalSearchScope scope) {
        Collection<LatexCommands> commands = new ArrayList<>();

        for (String key : getKeys(project)) {
            commands.addAll(getCommandsByName(key, project, scope));
        }

        return commands;
    }

    /**
     * Get all indexed LaTeX commands in the project.
     */
    @NotNull
    public static Collection<LatexCommands> getIndexedCommands(@NotNull Project project) {
        return getIndexedCommands(project, GlobalSearchScope.projectScope(project));
    }

    /**
     * Get all the indexed LaTeX commands with a certain name.
     *
     * @param name
     *         The name of the commands to get. E.g. "label" will only get all Label-commands .
     *         Preceding slashes will be ignored.
     */
    @NotNull
    public static Collection<LatexCommands> getIndexedCommandsByName(@NotNull String name,
                                                                     @NotNull Project project,
                                                                     @NotNull GlobalSearchScope scope) {
        Collection<LatexCommands> commands = new ArrayList<>();

        for (String key : getKeys(project)) {
            Collection<LatexCommands> cmds = getCommandsByName(key, project, scope);

            for (LatexCommands cmd : cmds) {
                String cmdToken = PRECEDING_SLASH.matcher(cmd.getCommandToken().getText()).replaceFirst("");
                String matchTo = PRECEDING_SLASH.matcher(name).replaceFirst("");

                if (!cmdToken.equals(matchTo)) {
                    continue;
                }

                commands.add(cmd);
            }
        }

        return commands;
    }

    /**
     * Get all the indexed LaTeX commands with a certain name in the project.
     *
     * @param name
     *         The name of the commands to get. E.g. "label" will only get all Label-commands .
     *         Preceding slashes will be ignored.
     */
    @NotNull
    public static Collection<LatexCommands> getIndexedCommandsByName(@NotNull String name,
                                                                     @NotNull Project project) {
        return getIndexedCommandsByName(name, project, GlobalSearchScope.projectScope(project));
    }

    @NotNull
    public static Collection<LatexCommands> getCommandsByName(@NotNull String name,
                                                              @NotNull Project project,
                                                              @NotNull GlobalSearchScope scope) {
        return StubIndex.getElements(LatexCommandsIndex.KEY, name, project, scope, LatexCommands.class);
    }

    @NotNull
    public static String[] getKeys(@NotNull Project project) {
        return ArrayUtil.toStringArray(StubIndex.getInstance().getAllKeys(LatexCommandsIndex.KEY, project));
    }

    @NotNull
    @Override
    public StubIndexKey<String, LatexCommands> getKey() {
        return KEY;
    }
}
