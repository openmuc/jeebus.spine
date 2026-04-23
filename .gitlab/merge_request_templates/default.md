
For the general deveopment process, please see [this Wiki page](https://gitlab.cc-asp.fraunhofer.de/eebus/jeebus/-/wikis/Development-Process).

## Definition of "Done"

Before you request a review or think about merging, please always follow this
checklist to make sure you are actually done. The main boxes should all be
checked. As not all checks concern every issue, some may remain unchecked. For
example, if you did not change any public functions, you don't need to consider the
documentation, just check the main box.

1. [ ] There are tests (at least for critical) changes to the codebase
2. [ ] All `TODO`s of the issue (and in code comments) are done
   - You can use IntelliJ's TODO Tool Window (normally on the bottom left) to filter
   the `TODO`s or `fixme`s in the code.
3. [ ] The public API (functions / classes) is documented
   - [ ] In the Javadoc
   - [ ] In the `CHANGELOG.md`
      - we adhere to the [common changelog specification](https://common-changelog.org)
   - [ ] In the demo module
   - [ ] In public documentation like READMEs
   - [ ] In Wikis
4. [ ] The whole project compiles locally and all tests run through
   (`./gradlew clean build`)
5. [ ] GitLab's automatical merge checks are all green (scroll down a bit)
6. [ ] Bonus: New / changed code does not produce warnings from the IDE
   - These are usually quite useful for writing clean code
   - If you think a warning is wrong, talk to your supervisor about changing the
   inspection profile comitted to the repository.

## If you are "Done"

1. Add the ~Feedback lablel to your issue (or drag-and-drop it on the
   [jEEBus issue board](https://gitlab.cc-asp.fraunhofer.de/groups/eebus/-/boards))
2. Assign a colleague as a reviewer to this merge request
3. The reviewer will open comment threads for any questions / change requests or
  press merge if all is well.

/ready
/unlabel ~Ready ~Feedback ~"In Progress"
