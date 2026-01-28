// leetcode 36

// time -o(1)
// space - o(1)

public class ValidSudoko {

    public static void main(String[] args) {
        
        char[][] b = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(b[i][j] != '.'){

                    int num = b[i][j] -'1';
                    int boxInd = (i/3)*3+(j/3);

                    if(rows[i][num] || cols[j][num] || boxes[boxInd][num]){
                        System.out.println(false);
                        return;
                    }

                    rows[i][num] = cols[j][num] = boxes[boxInd][num] = true;
                }
            }
        }

        System.out.println(true);

    }
    
}
