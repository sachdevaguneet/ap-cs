/*
 * Copyright (C) Tanisha - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package org.redbasin.interfaces;

/**
 * @author tanisha on 11/22/15.
 */
public class MusicTeacher implements Musician, Teacher {

  private Instrument instrument;
  private Subject subject;

  public MusicTeacher(Instrument instrument, Subject subject) {
    this.instrument = instrument;
    this.subject = subject;
  }

  @Override
  public Instrument getInstrument() {
    return instrument;
  }

  @Override
  public Subject getSubject() {
    return subject;
  }
}
