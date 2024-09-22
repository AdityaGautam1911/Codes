public class test {
    public static boolean check(int i, int j, int arr[][]) {
        for (int a = 0; a < arr.length; a++) {
            if (a == i) {
                continue;
            }
            if (arr[a][j] != 1) {
                return false;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            if (a == j) {
                continue;
            }
            if (arr[i][a] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 },
                { 1, 1, 1, 1 }
        };

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (check(i, j, arr)) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}