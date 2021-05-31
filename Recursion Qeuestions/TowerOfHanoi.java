package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==1){
            System.out.println(" move 1 disk from "+source+" to "+destination);
            return;
        }
        
        towerOfHanoi(disks-1,source,destination,auxiliary);// move n-1 disk from A to B using C as auxilarry
        System.out.println(" move "+disks+" from "+source+" to "+destination); // 
        towerOfHanoi(disks-1,auxiliary,source,destination); // move n-1 disk from B to C using A as auxilary
	}
//when n is 1 we need one movement 
	//when n is 2 we need  3 movement 
	//n=3 ke liye 7 movement
	//T(n)=2T(n-1)+1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'A', 'B', 'C');
	}

}
