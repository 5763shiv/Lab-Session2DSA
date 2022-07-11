package com.Shivansh.notecount.Service;

public class NoteCount {
	public void notesCountImpelementation(int notes[], int amount) {
		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0)
				System.out.println("exact amount can't be given with the highest denomination");
			else {
				System.out.println("your payment approach in order to give minimum nuber of notes will be");

				for (int i = 0; i < notes.length; i++) {
					if(noteCounter[i] != 0)
					{
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}

			}

		} catch (Exception ex) {
			System.out.println("notes of denomination 0 is invalid");
		}

	}

}
