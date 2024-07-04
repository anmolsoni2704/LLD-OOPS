package main.java.builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String batch;
    private String universityName;
    private String phoneNo;
    private double psp;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.batch = builder.batch;
        this.universityName = builder.universityName;
        this.phoneNo = builder.phoneNo;
        this.psp = builder.psp;
    }
    
    public static Builder getBuilder(){
        return new Builder();
    }
    
    public static class Builder{
        private String name;
        private int age;
        private int gradYear;
        private String batch;
        private String universityName;
        private String phoneNo;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            /*
            validation checks
             */
            if(this.gradYear <= 2020){
                throw new RuntimeException("grad year is not greater than 2020");
            }
            if(this.psp < 85){
                throw new RuntimeException("psp is less than 85");
            }
            return new Student(this);
        }
    }
}
