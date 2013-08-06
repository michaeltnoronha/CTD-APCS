package Numbers;

public class Numbers
{
    private int [] array;
    //private int arrayLength = (int)(Math.random() * 100 + 1);

    public Numbers(){
        int arrayLength = (int)(Math.random() * 100 + 1);
        array = new int [arrayLength];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 + 1);
        }
    }

    public Numbers(int arrayLength){
        array = new int [arrayLength];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 + 1);
        }
    }

    public void print(){
        for(int i = 0; i < array.length; i++){
            if(i % 10 == 9){
                System.out.printf("%d \n", array[i]);
            }
            else{
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public boolean hasMultipleOf(int z){
        boolean multipleOf = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] % z == 0){
                multipleOf =  true;
            }
            else{
                multipleOf = false;
            }
        }
        return multipleOf;
    }

    public int countOddNumbers(){
        int oddCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                oddCount++;
            }
        }
        return oddCount;
    }

    public int indexSum(int maxIndex){
        int sum = 0;
        if(maxIndex <= array.length){
            for(int i = 0; i < (maxIndex); i++){
                sum = sum + array[i];
            }
        }
        else{
            System.out.println("The number you entered is not compatible with the array size");
        }
        return sum;
    }

    public int get(int arrayIndex){
        int arrayItem = 0;
        if(arrayIndex <= array.length){
            arrayItem =  array[arrayIndex];
        }
        else{
            System.out.println("The index you entered is not compatible with the array size");
        }
        return arrayItem;
    }
}