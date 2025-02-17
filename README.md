# Groovy Dynamic Typing Bug

This repository demonstrates an uncommon bug related to Groovy's dynamic typing and how it interacts with collections. The `myMethod` function attempts to handle different data types, but it incorrectly handles lists resulting in unexpected output.

## Bug Description

The bug stems from the way Groovy handles lists in conditional statements. When a list is passed, it's not treated as an array of elements, but rather as a single `List` object. The `else` condition is executed, printing the list itself instead of processing its elements.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).

## Solution

The solution involves using the `instanceof` operator to check for `List` and then iterating over the elements to apply the desired operations.
