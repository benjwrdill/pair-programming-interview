# pair-programming-interview

This project is a demonstration and a starting point for pair programming interviews I conduct. It is meant to be a flexible toolkit for evaluating the skills of developers in an hour-long interview.

The intention of this interview is to practice [Pair Programming Ping Pong](http://wiki.c2.com/?PairProgrammingPingPongPattern) to gently guide candidates through a programming exercise and thinking through successively more complex problems.

## Goals
This project was created with some specific goals in mind:

- Propose a general problem that most candidates will be familiar with
- Ensure candidates can code in a paired environment
- Evaluate how candidates approach and reason about problems
- Keep candidates at ease by fostering a collaborative environment
- Keep the time dedicated to coding in the interview process to an hour, or less

## Problem
We start the interview by laying out a _very_ bare bones implementation of a Wallet that holds paper currency, called Bills. The Wallet can't actually do much. When we start the exercise, it can't even hold any bills!

In interviews targeting higher levels, consider providing a more complete implementation (more completed milestones) in order to focus on more interesting parts of the candidate's skillset.

### Use Cases
These use cases should be introduced by the interviewer over the course of the interview. The interviewer should do so by writing a failing test. In practice I like keeping the ping pong cycles as short as possible. That means writing the bare minimum to produce a failing test. Failing to compile due to NoMethodFound counts!

That means that for each of the use cases below, there should be several iterations of:
1. Interviewer writes a failing (partial) test
2. Candidate writes the code to pass the test
3. GOTO 1 until the use case is complete

#### Milestone 1: Bills
1. User should be able to add a Bill to a Wallet
2. User should be able to retrieve the total number of Bills in the Wallet
3. User should be able to retrieve the total value of Bills in the Wallet
4. User should be able to remove a Bill from the Wallet
5. User should be unable to remove a Bill that does not exist from the Wallet
6. User should be able to consolidate many Bills in order to minimize number of Bills in the Wallet

#### Milestone 2: Making Change
- TODO: Add Making Change use cases
#### Milestone 3: Adding Coins
- TODO: Add coins use cases
#### Milestone 4: Currency Conversion?????
- TODO: Add currency conversion use cases

## Leveling

This interview is meant to be similar to a typical pair programming session. Focus on short, iterative feedback loops. Follow threads of inquiry as they present themselves.

The following are some rough guidelines on using this project to evaluate developers at various levels of skill.

### Junior

- Candidate should be able to reason about use cases in conversation
- Candidate should take instruction on syntax and library APIs
- Should require guidance in getting some of the latter class I use cases

- Interviewer should offer ample guidance on syntax and useful library APIs (based on candidate's experience level in Java)

### Mid

- All of the above
- TODO: Add Mid level expectations

### Senior

- All of the above
- TODO: Add Senior level expectations
