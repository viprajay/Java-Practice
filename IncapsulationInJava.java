class IncapsulationInJava {

    private int id;

    public void setEmp_id(int id) {
        this.id = id;
        System.out.println(id);
    }

    // public int getEmp_id() {
    // return id;
    // }

    public static void main(String[] args) {
        IncapsulationInJava i = new IncapsulationInJava();
        i.setEmp_id(10);

    }
}