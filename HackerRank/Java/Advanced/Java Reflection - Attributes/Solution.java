public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }


    public static void main_Java8(String[] args) {
        Stream.of(Student.class.getDeclaredMethods())
                .map(Method::getName)
                .sorted()
                .forEach(System.out::println);
    }

}