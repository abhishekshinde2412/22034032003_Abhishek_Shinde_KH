import java.util.*;
class q1 {
	
	void insertion(int arr[]){
		int n= arr.length;
		for (int i=4;i>=0;i--){
			int temp =arr[i];
			int j = i-1;
			while (j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				printarray(arr);
				j=j-1;
			}
			arr[j+1]=temp;
		}
		printarray(arr);
	}
	
	void printarray(int arr1[]){
		int n= arr1.length;
		for (int i=0;i<n;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
	}



public static void main (String args[]){
	
	q1 ob1 = new q1();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int size = sc.nextInt();
	System.out.println("enter the elements of array");
	int one =sc.nextInt();
	int one2 =sc.nextInt();
	int one3=sc.nextInt();
	int one4 =sc.nextInt();
	int one5 =sc.nextInt();
	
	System.out.println("Solution-->");
	
	int a1[]={one,one2,one3,one4,one5};
	ob1.insertion(a1);
	
	
	
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int n = sc.nextInt();
	int a1[]= new int[n];*/
	

}

}