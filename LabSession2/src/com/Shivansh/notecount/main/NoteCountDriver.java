package com.Shivansh.notecount.main;

import java.util.Scanner;

import com.Shivansh.notecount.Service.NoteCount;

public class NoteCountDriver {
	public static void main(String[] args) {
		MergeSortImplimentation mergeSortImplementation = new MergeSortImplimentation();
		NoteCount noteCount = new NoteCount();
		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes, 0, notes.length + 1);
		noteCount.notesCountImpelementation(notes, amount);
		sc.close();

	}

}
