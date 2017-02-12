package nl.rubensten.texifyidea.util;

import com.intellij.openapi.vfs.VirtualFile;

/**
 * @author Ruben Schellekens
 */
public class FileUtil {

    /**
     * Checks if the given file is a PDF file.
     *
     * @param file
     *         The file to check.
     * @return {@code true} if the file is a pdf file, {@code false} when the file is not a pdf
     * file.
     */
    public static boolean isPdf(VirtualFile file) {
        return file.getExtension().equalsIgnoreCase("pdf");
    }

}
