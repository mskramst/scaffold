import * as player_funcs from './Player'

test ('adding ..', () => {
 expect(player_funcs.add(1,3)).toBe(4)
});

test ('player object', () => {
  let testPlayer = player_funcs.createPlayer("Chipper", "Jones", 45)
  console.log(testPlayer.getFullName())

  expect(testPlayer.getFullName()).toBe("Chipper Jones")
  expect(testPlayer.num).toBe(45)
});
