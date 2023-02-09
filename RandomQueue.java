package RandomQueue;


import java.util.concurrent.ThreadLocalRandom;


public class RandomQueue<Item> {

    private Item[] ItemArray = (Item[]) new Object[52];

    public int ItemCount = 0;

    public RandomQueue(){

    }
    public boolean isEmpty(){
        return true;
    }

    private void resize(int max) { // Move stack to a new array of size max.
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < ItemCount; i++) {
            temp[i] = ItemArray[i];
        }
        ItemArray = temp;
    }

    public void enqueue(Item item){
        if (ItemCount == ItemArray.length) {
            resize(2*ItemArray.length);
        }

        ItemArray[ItemCount++] = item;
    }

    public Item sample(){
        int random = ThreadLocalRandom.current().nextInt(0, ItemCount -1 );
        return ItemArray[random];
    }

    public Item dequeue(){
        int RandomIndex = ThreadLocalRandom.current().nextInt(0, ItemCount); // gets a random number that will be an index
        Item Temp = ItemArray[RandomIndex]; // stores the value of the chosen index in a placeholder variable
        ItemArray[RandomIndex] = ItemArray[ItemCount-1]; // moves the last item in the array to the chosen index
        ItemArray[ItemCount-1] = Temp; // moves the value stored in the placeholder variable to the last index in the array
        ItemCount--; // shrinks the accessible part of the array so the last number can no longer be selected
        return ItemArray[ItemCount]; // return the value that is no out of range of access of the array
    }

}