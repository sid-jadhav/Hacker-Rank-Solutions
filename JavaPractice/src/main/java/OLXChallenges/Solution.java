package OLXChallenges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		boolean isSold=true;
		HashMap<Integer,LinkedList<Product>> sellPro=new HashMap<>();
		
		
		HashMap<Integer,LinkedList<Area>> sellArea=new HashMap<>();
		
	
		int t,day,p_id,c_id,s_id,r_id,d_start,d_end;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++){
			LinkedList<Area> area=new LinkedList<>();
			LinkedList<Product> pro=new LinkedList<>();
			LinkedList<Area> areaR=new LinkedList<>();
			
			String c,s;
			c=scan.next();
			if(c.equals("S")){
				day=scan.nextInt();
				s=scan.next();
				if(s.contains(".")){
					if(s.length()==3){
						p_id=Integer.parseInt(s.substring(0, 1));
						c_id=Integer.parseInt(s.substring(2, 3));
					}else{
						p_id=10;
						c_id=Integer.parseInt(s.substring(3, 4));
					}
				}else{
					p_id=Integer.parseInt(s.substring(0, 1));
					c_id=0;
				}
				
				Product p=new Product(p_id,c_id);
				if(!sellPro.containsKey(day)){
					pro.add(p);
					sellPro.put(day, pro);
				}else{
					pro=sellPro.get(day);
					pro.add(p);
					sellPro.put(day, pro);
				}
				
				s=scan.next();
				if(s.contains(".")){
					if(s.length()==3){
						s_id=Integer.parseInt(s.substring(0, 1));
						r_id=Integer.parseInt(s.substring(2, 3));
					}else{
						s_id=Integer.parseInt(s.substring(0, 1));;
						r_id=Integer.parseInt(s.substring(2, 4));
					}
				}else{
					s_id=Integer.parseInt(s.substring(0, 1));
					r_id=0;
				}
				Area a=new Area(s_id,r_id,p);
				if(!sellArea.containsKey(day)){
					area.add(a);
					sellArea.put(day, area);
				}else{
					area=sellArea.get(day);
					area.add(a);
					sellArea.put(day, area);
				}
				
				
			}else if(c.equals("Q")){
				s=scan.next();
				if(s.length()==3){
					d_start=Integer.parseInt(s.substring(0, 1));
					d_end=Integer.parseInt(s.substring(2, 3));
				}else{
					d_start=Integer.parseInt(s.substring(0, 1));
					d_end=d_start;
				}
				s=scan.next();
				if(s.equals("-1")){
					p_id=0;
					c_id=0;
				}else{
					if(s.contains(".")){
						if(s.length()==3){
							p_id=Integer.parseInt(s.substring(0, 1));
							c_id=Integer.parseInt(s.substring(2, 3));
						}else{
							p_id=Integer.parseInt(s.substring(0, 1));
							c_id=Integer.parseInt(s.substring(2, 4));
						}
					}else{
						p_id=Integer.parseInt(s.substring(0, 1));
						c_id=0;
					}
				}
				s=scan.next();
				if(s.equals("-1")){
					s_id=0;
					r_id=0;
				}else{
					if(s.contains(".")){
						if(s.length()==3){
							s_id=Integer.parseInt(s.substring(0, 1));
							r_id=Integer.parseInt(s.substring(2, 3));
						}else{
							s_id=Integer.parseInt(s.substring(0, 1));;
							r_id=Integer.parseInt(s.substring(2, 4));
						}
					}else{
						s_id=Integer.parseInt(s.substring(0, 1));
						r_id=0;
					}
				}
				for(int j=d_start;j<=d_end;j++){
					LinkedList<Product> proR=new LinkedList<>();
					//checks if key is there
					if(sellPro.containsKey(j)){
						pro=sellPro.get(j);
						if(p_id==0 && c_id==0){
							proR=pro;
						}else{
							if(c_id==0){
								for(Product p: pro){
									if(p_id==p.p_id)
									proR.add(p);
								}
							}else{
								for(Product p: pro){
									if(p_id==p.p_id && c_id==p.c_id)
									proR.add(p);
								}
							}
						}
					}else{
						break;
					}
					if(sellArea.containsKey(j)){
						area=sellArea.get(j);
						if(r_id==0 && s_id==0){
							for(Area a:area){
								for(Product p:proR){
									if(p.c_id==0){
										if(a.pro.p_id==p.p_id){
											areaR.add(a);
										}
									}else{
										if(a.pro.c_id==p.c_id &&a.pro.p_id==p.p_id){
											areaR.add(a);
										}
									}
								}
							}
						}else{
							if(r_id==0){
								for(Area a:area){
									for(Product p:proR){
										if(p.c_id==0){
											if(a.pro.p_id==p.p_id){
												areaR.add(a);
											}
										}else{
											if(a.pro.c_id==p.c_id &&a.pro.p_id==p.p_id){
												areaR.add(a);
											}
										}
									}
								}
							}else{
								for(Area a:area){
									for(Product p:proR){
										if(p.c_id==0){
											if(a.pro.p_id==p.p_id){
												areaR.add(a);
											}
										}else{
											if(a.pro.c_id==p.c_id &&a.pro.p_id==p.p_id){
												areaR.add(a);
											}
										}
									}
								}
							}
						}
					}else{
						
						break;
					}
				}
				
				System.out.println(areaR.size());
			}
		}
	}

}
