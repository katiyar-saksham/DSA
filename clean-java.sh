#!/bin/bash

echo "Cleaning Java build files..."

find . -type f -name "*.class" -delete

find . -type d -name "out" -exec rm -rf {} +
find . -type d -name "build" -exec rm -rf {} +
find . -type d -name "bin" -exec rm -rf {} +
find . -type d -name "target" -exec rm -rf {} +

echo
echo "Cleanup finished."
echo

git status