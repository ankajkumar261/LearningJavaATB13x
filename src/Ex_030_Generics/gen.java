package Ex_030_Generics;

public class gen {
    public static void main(String[] args) {

        genclass c1 = new genclass(4);
        genclass c2 = new genclass("parmod");
        genclass c3 = new genclass(4.554);



    }

}

class genclass<T>{
    private T data ;


    public genclass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
