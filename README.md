# jEEBus.SPINE

<img src=".idea/icon.svg" width="200" style="float: right" align="right"/>

[![maven-central](https://img.shields.io/maven-central/v/org.openmuc.jeebus/spine?logo=apachemaven)](https://central.sonatype.com/artifact/org.openmuc.jeebus/spine)
[![Ask DeepWiki](https://deepwiki.com/badge.svg)](https://deepwiki.com/openmuc/jeebus.spine)

This repository contains the Java implementation of the Smart Premises Interoperable
Neutral-message Exchange (SPINE) which represents the information layer of
the [EEBus Communication Standard](https://www.eebus.org/), containing its data
model. It is developed and maintained by the Team Smart Grid Communication at the
Fraunhofer Institute for Solar Energy Systems ISE. For further information please
refer to [our website](https://www.openmuc.org/).

The SPINE Specification can be [downloaded](https://www.eebus.org/media-downloads/)
from the website of the EEBus Initiative e.V.

## Documentation

In the [EEBus section](https://www.openmuc.org/eebus) of
the [openMUC website](https://www.openmuc.org) you can also find a
public [User Guide](https://www.openmuc.org/eebus/spine/user-guide) as well as
our [JavaDocs](https://www.openmuc.org/eebus/spine/javadoc/) for this project.

## Key Features

jEEBus.SPINE provides an easy-to-use API and features many abstractions and
automations to make EEBus use case development more efficient.

- **Automated NodeManagement:** Our implementation of SPINE `NodeManagement`
  automatically handles subscription-, binding- or remote discovery requests.
- **Automated Discovery API:** You can register `UseCaseListeners` that are
  automatically called only if valid use case partners are identified on remote
  devices.
- **Complete and powerful SPINE data classes:** jEEBus.SPINE essentially uses the
  SPINE data model as a metamodel for code generation and serialization. This
  Model-driven engineering approach brings a number of benefits:
   - SPINE Specification updates are quick and easy to implement
   - There is less room for implementation errors
   - Every data class has powerful convenience features:
      - Fluent builder API + constructors
      - Cloning and copying
      - Deep equal checks
      - Sensible hash code generation
      - Human-readable string representations
- **Abstract Feature and FeatureFunction logic:** This includes the handling of
  `READ` / `WRITE` commands, SPINE protocol validation, filtering via Selectors and
  ElementTypes and the notification of subscribers.
- **Integration with [jEEBus.SHIP](https://github.com/openmuc/jeebus.ship):** jEEBus.SPINE seamlessly integrates jEEBus.SHIP
  for transport layer functionality.

## Contributing

We are currently working out the contribution process.

If you would like to contribute to this project, please get in touch with the
development team here on GitHub or use
[the contact form on our website](https://www.openmuc.org/contact/).

## Project Setup

This is a Gradle Project that comes with a packaged Gradle Wrapper (use `./gradlew`
on Linux and `gradlew.bat` on Windows systems). You can run the following command to
download all necessary dependencies and build the project:

```bash
./gradlew clean build
```

To run all contained unit tests, run

```bash
./gradlew test
```

There are three subprojects in the `projects` folder. `spine` contains the general
implementation of SPINE, while `spine-test-utilities` provides a framework to develop
automatic tests for SPINE applications. `demo` contains minimal example applications
showing how jEEBus.SPINE can be configured and used.

## License

Copyright (c) 2026 Fraunhofer ISE

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
https://www.eclipse.org/legal/epl-2.0 or the provided `LICENSE` file.

SPDX-License-Identifier: `EPL-2.0`
