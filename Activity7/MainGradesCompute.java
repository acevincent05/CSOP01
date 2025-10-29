import javax.swing.JOptionPane;

public class MainGradesCompute {
    public static void main(String[] args) {
        double prelimGrade = Double.parseDouble(JOptionPane.showInputDialog("Prelim Grade: "));
        double midtermGrade = Double.parseDouble(JOptionPane.showInputDialog("Midterm Grade: "));
        double semiFinals = Double.parseDouble(JOptionPane.showInputDialog("Semi-Finals Grade: "));
        double finalGrade = Double.parseDouble(JOptionPane.showInputDialog("Finals Grade: "));

        String msg = String.format("""
            Prelim Grades: %.2f
            Midterm Grades: %.2f
            Semi-Finals Grades: %.2f
            Finals Grades: %.2f
            """, prelimGrade, midtermGrade, semiFinals, finalGrade);

        GradeCalculation gc = new GradeCalculation(prelimGrade, midtermGrade, semiFinals, finalGrade);

        gc.computeSum();
        gc.computeAverage();

        String[] options = {"Average", "Percentage", "Cancel"};

        int response = JOptionPane.showOptionDialog(
            null,
            "Show as:",
            "GRADES",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (response == 0) {
            msg += String.format("""

                Average: %.2f
                """, gc.getAverage());
        } else if (response == 1) {
            double percentageGrade = gc.computeGradePercentage(prelimGrade, midtermGrade, semiFinals, finalGrade);
            msg += String.format("""

                Percentage: %.2f%%
                """, percentageGrade);
        } else {
            JOptionPane.showMessageDialog(null, "Program has been cancelled.");
            System.exit(1);
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}

class GradeComputation {
    private double sum;
    private double average;
    private final double prelimGrade;
    private final double midtermGrade;
    private final double semiFinalGrade;
    private final double finalGrade;

    public GradeComputation(double prelimGrade, double midtermGrade, double semiFinalGrade, double finalGrade) {
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.semiFinalGrade = semiFinalGrade;
        this.finalGrade = finalGrade;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public double computeSum() {
        return sum = prelimGrade + midtermGrade + semiFinalGrade + finalGrade;
    }

    public double computeAverage() {
        if (sum == 0) {
            computeSum();
        }
        return average = sum / 4;
    }
}

class GradeCalculation extends GradeComputation {
    public GradeCalculation(double prelimGrade, double midtermGrade, double semiFinalGrade, double finalGrade) {
        super(prelimGrade, midtermGrade, semiFinalGrade, finalGrade);
    }

    public double computeGradePercentage(double prelimGrade, double midtermGrade, double semiFinalGrade, double finalGrade) {
        double grade;
        grade = (prelimGrade * 0.20) + (midtermGrade * 0.20) + (semiFinalGrade * 0.20) + (finalGrade * 0.40);
        return grade;
    }
}
