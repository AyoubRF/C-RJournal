import { TestBed, inject } from '@angular/core/testing';
import { provideMockActions } from '@ngrx/effects/testing';
import { Observable } from 'rxjs';

import { EffectAdminEffects } from './admin.effects';

describe('AdminEffects', () => {
  let actions$: Observable<any>;
  let effects: EffectAdminEffects;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        EffectAdminEffects,
        provideMockActions(() => actions$)
      ]
    });

    effects = TestBed.get(EffectAdminEffects);
  });

  it('should be created', () => {
    expect(effects).toBeTruthy();
  });
});
