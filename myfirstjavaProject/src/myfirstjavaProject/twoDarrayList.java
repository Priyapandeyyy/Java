package myfirstjavaProject;

import java.util.*;  

public class twoDarrayList {
	public static void main(String[] args) {
		
		// 2D ArrayList = a dynamic list of lists.
		// You can change the size of these lists during runtime.
		
		ArrayList<ArrayList<String>> meme = new ArrayList();
		
		ArrayList<String> memeList = new ArrayList();
		memeList.add("Ayein, baigan");
		memeList.add("Eww brother eww, what's that brother, what's that");
		memeList.add("Gian hai aap");
		
		ArrayList<String> memeList1 = new ArrayList();
		memeList1.add("Feeling proud indian army");
		memeList1.add("Chippi Chippi, Chapa chapa");
		memeList1.add("Pura parivar dara hua hai yrr maut se kisko dar nahi lagta");
		
		ArrayList<String> memeList2 = new ArrayList();
		memeList2.add("Jogi ji nind naa ave (jogi ji haan jogi ji), sajan ki yaad satave");
		memeList2.add("Haahha, kya joke mara hai bhai wooooo... maza aa gaya");
		
		meme.add(memeList);
		meme.add(memeList1);
		meme.add(memeList2);
		
		System.out.println(meme.get(2).get(0));
	}
}
