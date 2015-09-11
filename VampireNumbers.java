import java.util.*;
import java.io.*;

public class VampireNumbers
{
	
	public static void main(String[] args)
	{
		for (int n = 10; n < 100; n++) {
			for (int m = 10; m < 100; m++) {
				int mlt;
				mlt = n*m;
				if (mlt > 999 && mlt < 10000) {
					
					int n1 = n/10;
					int n0 = n%10;
					int m1 = m/10;
					int m0 = m%10;
					int fangSum = n1 + n0 + m1 + m0;
					
					int mlt0 = mlt % 10;
					int mlt1 = ((mlt % 100) - mlt0)/10;
					int mlt2 = ((mlt % 1000) - mlt1 - mlt0)/100;
					int mlt3 = ((mlt % 10000) - mlt2 - mlt1 - mlt0)/1000;
					int vampSum = mlt0 + mlt1 + mlt2 + mlt3;
					
					String sn1 = new String(Integer.toString(n1));
					String sn0 = new String(Integer.toString(n0));
					String sm0 = new String(Integer.toString(m0));
					String sm1 = new String(Integer.toString(m1));
					
					String mltc = Integer.toString(mlt);
					if (mltc.contains(sn1) && mltc.contains(sn0) && mltc.contains(sm1) && mltc.contains(sm0)) {
						if (mlt0 == n1 || mlt0 == n0 || mlt0 == m1 || mlt0 == m0) {
							if (mlt1 == n1 || mlt1 == n0 || mlt1 == m1 || mlt1 == m0) {
								if (mlt2 == n1 || mlt2 == n0 || mlt2 == m1 || mlt2 == m0) {
									if (mlt3 == n1 || mlt3 == n0 || mlt3 == m1 || mlt3 == m0) {
										if (fangSum == vampSum) {
											System.out.println("Vampire " + mlt + " with fangs " + n + " and " + m);
										}
									}
								}
							}
						}
					}
				
				}
			}
		}
	}
}
