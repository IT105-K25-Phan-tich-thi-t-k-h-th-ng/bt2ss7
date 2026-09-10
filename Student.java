public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private float score;

    public Student(String studentId, String fullName, int age, float score) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        setScore(score);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        if (score >= 0.0f && score <= 10.0f) {
            this.score = score;
        } else {
            System.out.println('Lỗi: Điểm số không hợp lệ (' + score + '). Phải nằm trong khoảng từ 0 đến 10!');
        }
    }

    public void displayInfo() {
        System.out.println('Mã SV: ' + studentId + ' | Họ tên: ' + fullName + ' | Tuổi: ' + age + ' | Điểm: ' + score);
    }
}