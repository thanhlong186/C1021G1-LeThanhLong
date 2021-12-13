package extra_exercises.bai_1.model;

public class Candidate {
    private int id;
    private String name;
    private String dayOfBirth;
    private int pointMath;
    private int pointLiterature;
    private int pointEnglish;

    public Candidate () {
    }

    public Candidate(int id, String name, String dayOfBirth, int pointMath, int pointLiterature, int pointEnglish) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getPointMath() {
        return pointMath;
    }

    public void setPointMath(int pointMath) {
        this.pointMath = pointMath;
    }

    public int getPointLiterature() {
        return pointLiterature;
    }

    public void setPointLiterature(int pointLiterature) {
        this.pointLiterature = pointLiterature;
    }

    public int getPointEnglish() {
        return pointEnglish;
    }

    public void setPointEnglish(int pointEnglish) {
        this.pointEnglish = pointEnglish;
    }

    public void setSum(int pointEnglish, int pointLiterature, int pointMath) {
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }
    public int getSum() {
        return getPointEnglish() + getPointMath() + getPointLiterature();
    }


    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", pointMath=" + pointMath +
                ", pointLiterature=" + pointLiterature +
                ", pointEnglish=" + pointEnglish + "\t" +
                "Sum=" + getSum() + '\t' +
                '}';
    }
}
