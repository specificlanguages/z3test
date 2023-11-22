import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;

public class Z3Test {

    public static void main(String[] args) {
        try (Context context = new Context()) {
            final Solver solver = context.mkSolver();
            solver.fromString("(declare-fun A () Bool)\n" +
                              "(declare-fun |0| () Bool)\n" +
                              "(assert (=> |0| ((_ pbeq 1 1) A)))");

            final Status status = solver.check();
            System.out.println("Status: " + status);
        }
    }
}
