package Weekend_6.Polymorphism;

public enum Grade {
   FRESH(1),SOPHOMORE(2),JUNIOR(3),SENIOR(4);

    private int grade;
    Grade(int i) {
        grade = i;
    }
    public void upGrade()
    {
        grade++;
    }
    public Grade getGrade()
    {
        Grade g = null;
        switch (grade)
        {
            case 1:
                g= Grade.FRESH;
                break;
            case 2:
                g= Grade.SOPHOMORE;
                break;
            case 3:
                g= Grade.JUNIOR;
                break;
            case 4:
                g= Grade.SENIOR;
                break;
        }
        return g;
    }


}