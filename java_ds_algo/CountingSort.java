class CountingSort {
    
    public void sort(char a[]){
        
        int n = a.length;
        
        char output[] = new char[n];
        
        int count[] = new int[256];
        
        for(int i = 0; i < 256; i++){
            count[i] = 0;
        }
        
        for(int i = 0; i < n; i++){
            ++count[a[i]];
        }
        
        for(int i = 1; i <= 255; i++){
            count[i] += count[i-1];
        }
        
        for(int i = 0; i < n; i++){
            output[count[a[i]] - 1] = a[i];
            --count[a[i]];
        }
        
        for(int i = 0; i < n; i++){
            a[i] = output[i];
        }
    }
    
    
    
    
    public static void main(String arg[]){
        
        CountingSort cs = new CountingSort();
        String text = new String();
        text = "Hello I am Gaurav";
        char a[] = text.toCharArray() ;
        
        cs.sort(a);
        
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}