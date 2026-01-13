// leetcode 37

public class SudokoSolver {

    public static void main(String[] args) {

        char[][] b = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        sudokoSolver(b, 0, 0);

        for (char[] arr : b) {
            for (char ele : arr) {
                System.out.printf("%2s", ele);
            }
            System.out.println();
        }
    }

    private static boolean sudokoSolver(char[][] b, int row, int col) {

        if (row == b.length) {
            return true;
        }

        int nrow;
        int ncol;

        if (col != b.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (b[row][col] != '.') {

            if (sudokoSolver(b, nrow, ncol)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {

                if (isSafe(row, col, b, i)) {
                    b[row][col] = (char) (i + '0');

                    if (sudokoSolver(b, nrow, ncol)) {
                        return true;
                    } else {
                        b[row][col] = '.';
                    }
                }
            }

        }

        return false;
    }

    private static boolean isSafe(int row, int col, char[][] b, int num) {

        char cNum = (char) (num + '0');

        for (int i = 0; i < b.length; i++) {

            if (b[i][col] == cNum) {
                return false;
            }

            if (b[row][i] == cNum) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (b[i][j] == cNum) {
                    return false;
                }
            }
        }

        return true;

    }

}
