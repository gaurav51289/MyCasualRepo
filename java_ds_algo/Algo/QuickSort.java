class QuickSort{
    
    public void swapMe(int a[], int x, int y){
        int temp;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    int partition(int a[], int low, int high){
        
        int i = low - 1;
        int pivot = a[high];
        for(int j = low; j < high; j++){
            
            if(a[j] <= pivot ){
                i++;
                swapMe(a, i, j);
            }
            
        }
        
        swapMe(a, high, i+1);
        
        return i+1;
        
        
    }
    
    public void sortMe(int a[], int low, int high){
        
        if(low < high){
            int pi = partition(a, low, high);
        
            sortMe(a, low, pi-1);
            for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
            sortMe(a, pi+1, high);
            for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
            System.out.println();
        }
        
    }
    
    
    public static void main(String arg[]){
        
        QuickSort qs = new QuickSort();
        
        int a[] = {23,24,56,32,6,12};
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
            System.out.println();
        
        qs.sortMe(a, 0, a.length-1);
        
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}