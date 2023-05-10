package src.candidate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("unchecked")

public class CandidateManager {

	private ArrayList<Candidate> candidates;

	public CandidateManager() {
		this.candidates = new ArrayList<>();
	}

	public boolean readData(String textFile) {
		try {
			File file = new File(textFile);
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				String[] fields = fileReader.nextLine().trim().split("\\|");
				if (fields.length != 6) {
					continue;
				}
				String id = fields[0].trim();
				String name = fields[1].trim();
				String selection = fields[2].trim();
				String sex = fields[3].trim();
				int year = Integer.parseInt(fields[4].trim());
				int priority = Integer.parseInt(fields[5].trim());

				Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);
				this.candidates.add(newCandidate);
			}

			fileReader.close();
			return true;
		} catch (IOException ex) {
			System.out.println("Error reading file '" + textFile + "'");
			return false;
		}
	}

	public ArrayList<Candidate> getSelectionCandicates(String selection) {
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).selection().equals(selection)) {
				list.add(candidates.get(i));
			}
		}
		return list;
	}

	public ArrayList<Candidate> getPriorityCandidates() {
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.get(i).priority() == 1) {
				list.add(candidates.get(i));
			}
		}
		return list;
	}

	public ArrayList<Candidate> sortByName() {
		for (int i = 0; i < candidates.size(); i++) {
			for (int j = i + 1; j < candidates.size(); j++) {
				if (candidates.get(i).name().compareTo(candidates.get(j).name()) > 0) {
					Candidate temp = candidates.get(i);
					candidates.set(i, candidates.get(j));
					candidates.set(j, temp);
				}
			}
		}
		return candidates;
	}

	public ArrayList<Candidate> getSecondYoungestCandidates() {
		ArrayList<Candidate> list = new ArrayList<>();
		int max1 = candidates.get(0).year();
		int max2 = 0;
		for (int i = 0; i < candidates.size(); i++) {
			if (max1 < candidates.get(i).year()) {
				max1 = candidates.get(i).year();
			}
		}
		for (int i = 0; i < candidates.size(); i++) {
			if (max2 < candidates.get(i).year() && candidates.get(i).year() < max1) {
				max2 = candidates.get(i).year();
			}
		}
		for (int i = 0; i < candidates.size(); i++) {
			if (max2 == candidates.get(i).year()) {
				list.add(candidates.get(i));
			}
		}
		return list;
	}

	public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
		if (candidates == null) {
			return;
		}

		for (int i = 0; i < candidates.size(); i++) {
			candidates.get(i).print();
		}
	}

	public void printCandidates() {
		printCandidatesFromArray(this.candidates);
	}

	public static void main(String[] args) {
		CandidateManager candidateManager = new CandidateManager();
		if (!candidateManager.readData("candidates.txt")) {
			return;
		}

//        ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
//        candidateManager.printCandidatesFromArray(selectionCandidates);
//        System.out.println();
//        
//        ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
//        candidateManager.printCandidatesFromArray(priorityCandidates);
//        System.out.println();
//            
//        ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
//        candidateManager.printCandidatesFromArray(sortedNameCandidates);
//        System.out.println();
//            
//        ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
//        candidateManager.printCandidatesFromArray(secondYoungestCandidates);
	}
}
