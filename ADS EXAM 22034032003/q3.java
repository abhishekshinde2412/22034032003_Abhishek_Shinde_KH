import java.util.*;
class q3{
	
	static int arr[];
	int size;
	int top1;
	int top2;
	
	q3(int n){
		size=n;
		arr=new int[n];
		top1 =n/2+1;
		top2 =n/2;
	}
	
	void push1(int x){
		if (top1>0){
			top1--;
			arr[top1]=x;
		}
		
	}
	
	void push2(int x){
		if (top2<size-1){
			top2++;
			arr[top2]=x;
		}
	}
	
	int pop1(){
		if (top1 <= size/2){
			int x = arr[top1];
			top1++;
			return x;
		}
		return -1;
	}
	
	int pop2(){
		if (top2 <= size/2+1){
			int x = arr[top1];
			top2--;
			return x;
		}
		return -1;
	}
	static void display(int arr[]){
		int n= arr.length;
		for (int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		
	}
	
	public static void main (String args[]){
		q3 st1 =new q3(10);
		
		st1.push1(5); 
        st1.push2(10); 
		st1.push2(15); 
		st1.push1(11); 
		st1.push2(7); 
		st1.push2(40);
		st1.pop1();
		st1.pop2();
		
		st1.display(arr);
	}	
}