public class QuadraticEquationSolver {

    private double a, b, c;

    public QuadraticEquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculateRootsCount() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            return 2; // Два різних корені
        } else if (discriminant == 0) {
            return 1; // Один подвійний корінь
        } else {
            return 0; // Немає дійсних коренів
        }
    }

    public double[] calculateRoots() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return null; // Немає дійсних коренів
        }
    }

    public static void main(String[] args) {
        // Bикористання класу
        QuadraticEquationSolver equation = new QuadraticEquationSolver(1, -3, 2);
        int rootsCount = equation.calculateRootsCount();

        if (rootsCount > 0) {
            double[] roots = equation.calculateRoots();
            System.out.println("Кількість коренів: " + rootsCount);
            System.out.print("Корені: ");
            for (double root : roots) {
                System.out.print(root + " ");
            }
        } else {
            System.out.println("Немає дійсних коренів.");
        }
    }
}
