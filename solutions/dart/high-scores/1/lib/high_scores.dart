class HighScores {
  final List<int> scores;
  HighScores(this.scores);

  int latest(){
    return scores.last;
  }
  int personalBest(){
    List<int> myScores = List.from(scores);
    myScores.sort();
    return myScores.last;
  }
  List<int> personalTopThree(){
    List<int> myScores = List.from(scores);
    myScores.sort();
    return myScores.reversed.toList().getRange(0, (myScores.length > 3? 3: myScores.length)).toList();
  }
}
