import unittest

from funcs import strings

class TestStrings(unittest.TestCase):

    def test_hello_name(self):
        self.assertEqual(strings.hello_name("Bob"), "Hello Bob", "Should combine name")
        self.assertEqual(strings.hello_name("X"), "Hello X", "Should display Hello X")

    def test_make_abba(self):
        self.assertEqual(strings.make_abba("Hi", "Bye"), "HiByeByeHi", "")
        self.assertEqual(strings.make_abba("Yo", "Alice"), "YoAliceAliceYo", "")
        self.assertEqual(strings.make_abba("What", "Up"), "WhatUpUpWhat", "")

    def test_make_tags(self):
        self.assertEqual(strings.make_tags("i", "Yay"), "<i>Yay</i>", "")
        self.assertEqual(strings.make_tags("cite", "Hey"), "<cite>Hey</cite>", "")

    def test_count_substrings(self):
        self.assertEqual(strings.count_substrings("banana", "na"),2)
        self.assertEqual(strings.count_substrings("aluminum", "um"),2)
        self.assertEqual(strings.count_substrings("forever", "four"),0)

    def test_count_substrings_long(self):
        self.assertEqual(strings.count_substrings_long("banana", "na"),2)
        self.assertEqual(strings.count_substrings_long("aluminum", "um"),2)
        self.assertEqual(strings.count_substrings_long("forever", "four"),0)

    def test_surround_shorter(self):
        self.assertEqual(strings.surround_shorter("bad", "mood"), "mood bad mood");
        self.assertEqual(strings.surround_shorter("mood", "bad"), "mood bad mood");

    def test_surround_longer(self):
        self.assertEqual(strings.surround_longer("bad", "mood"), "bad mood bad");
        self.assertEqual(strings.surround_longer("mood", "bad"), "bad mood bad");
if __name__ == '__main__':
    unittest.main()
