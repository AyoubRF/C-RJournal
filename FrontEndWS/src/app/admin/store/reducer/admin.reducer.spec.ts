import { reducer } from './admin.reducer';
import { intialUserState,  IUserState } from '../state/user.state';

describe('Admin Reducer', () => {
  describe('an unknown action', () => {
    it('should return the previous state', () => {
      const action = {} as any;

      const result = reducer(intialUserState, action);

      expect(result).toBe(intialUserState);
    });
  });
});
