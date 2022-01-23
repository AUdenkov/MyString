package Filter;

public class Check implements Filter {
    Object[] array;

    public Check(Object[] array) {
        this.array = array;
    }

    @Override
    public void apply(Object o) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                count++;
                for (int j = i; j < array.length-1; j++) {
                   array[j]=array[j+1];
                }
            }
        }
        Object[] newArray=new Object[array.length-count];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array.length);
    }

}
