public class HeapSort{
    
    public void swapMe(int a[], int x, int y){
        int temp;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    public void heapify(int a[], int n, int i){
        
        //largest as root
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        
        //check left child
        if(l<n && a[l] > a[largest])
            largest = l;
            
        if(r<n && a[r] > a[largest])
            largest = r;
            
        if(largest != i){
            
            //swap 
            swapMe(a, largest, i);
            
            //heapify the affected sub tree
            heapify(a, n, largest);
            
        }    
        
    }
    
    
    public void sort(int a[], int n){
        
        //build heap
        for(int i = n/2-1; i>=0; i--)
            heapify(a, n, i);
            
        //swap
        for(int i=n-1; i>=0; i--){
            
            swapMe(a, i, 0);
            
            heapify(a, i, 0);
            
        }
    }
    
    public static void main(String arg[]){
        
        HeapSort hs = new HeapSort();
        
        int a[] = {23, 24,56,32,6,12};
        
        hs.sort(a, a.length);
        
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}