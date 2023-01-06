fn main() {
    println!("Hello, world!");
    println!("{}", add(1,2));
}

pub fn add_two(a: i32) -> i32 {
    add(a, 2)
}

pub fn add(a: i32, b: i32) -> i32 {
    a + b
}

#[test]
 fn test_add() {
    assert_eq!(add(1,2), 3);
    assert_eq!(add(-4,-2), -5);
 }
