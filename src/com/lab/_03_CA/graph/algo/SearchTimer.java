/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._03_CA.graph.algo;

import com.lab._03_CA.algo.Search;
import com.lab._03_CA.graph.core.Reporter;
import com.lab._03_CA.graph.core.TaskTimer;




/**
 *
 * @author KurtJunsheanEspinosa
 */




class SearchTimer extends TaskTimer {
  Search algo;
  private int[] keys;
  
  public SearchTimer(Reporter out, Search algo) {
    super(out);
    this.algo = algo;
  }
  
  public void initialize(int n) {
    algo.clear();
    keys = new int[n];
    for (int i = 0; i < n; i++) {
      keys[i] = i;
      algo.insert(keys[i]);
    }
  }
  
  public void doTask(int n) {
    initialize(n);
    
    algo.search(n);
  }
}
