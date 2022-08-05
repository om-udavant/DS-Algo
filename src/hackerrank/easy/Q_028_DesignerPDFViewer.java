package hackerrank.easy;

public class Q_028_DesignerPDFViewer {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * When a contiguous block of text is selected in a PDF viewer,
     * the selection is highlighted with a blue rectangle. In this PDF viewer,
     * each word is highlighted independently.
     * For example:
     * There is a list of 26 character heights aligned by index to their letters.
     *For example, 'a' is at index 0 and 'z' is at index 25.
     * There will also be a string. Using the letter heights given, determine the area
     * of the rectangle highlight in mm^2 assuming all letters are 1mm wide.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static void main(String[] args) {

        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";

        int result = designerPdfViewer(h, word);

        System.out.println(result);
    }

    private static int designerPdfViewer(int[] h, String word) {

        int height = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = Math.abs('a' - word.charAt(i));
            int val = h[index];

            if (height < val) {
                height = val;
            }
        }

        int width = word.length();

        return height * width;
    }
}
