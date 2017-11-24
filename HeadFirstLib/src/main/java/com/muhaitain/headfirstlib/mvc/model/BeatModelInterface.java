package com.muhaitain.headfirstlib.mvc.model;

import com.muhaitain.headfirstlib.mvc.observer.BPMObserver;
import com.muhaitain.headfirstlib.mvc.observer.BeatObserver;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver beatObserver);
    void removeObserver(BeatObserver beatObserver);
    void registerObserver(BPMObserver bpmObserver);
    void removeObserver(BPMObserver bpmObserver);
}
