import java.util.*;

public class ballsGame {
    public static int lastPickSum(int N, int P, int Q) {

        // this is default OUTPUT. You can change it.
        int result = 0;

        // write your Logic here:
        int totalBallsRemaining = N;
        int jackBalls = 0;
        int johnBalls = 0;
        Boolean jacksTurn = true;

        for (int i = 0; (totalBallsRemaining + P < N) || (totalBallsRemaining + Q < N); i++)
            if (jacksTurn) {
                totalBallsRemaining = -P;
                jackBalls += P;
                jacksTurn = false;
                System.out.println(totalBallsRemaining);
                // added below line to stop compiler from bitching
                i=i+0;
            } else {
                totalBallsRemaining = -Q;
                johnBalls += Q;
                jacksTurn = true;
                System.out.println(totalBallsRemaining);
            }
        if (jacksTurn) {
            jackBalls += totalBallsRemaining;
            result = jackBalls;
        } else {
            johnBalls += totalBallsRemaining;
            result = johnBalls;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();

        sc.close();

        // OUTPUT [uncomment & modify if required]
        System.out.print(lastPickSum(N, P, Q));
    }
}