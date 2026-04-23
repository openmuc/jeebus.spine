# Changelog

## [4.0.0] - 2026-04-23

_First open-Source Release under the EPL-2.0_

### Changed

- change project license to the Eclipse Public License 2.0 (EPL-2.0)
- replace `startClients` boolean option with `connectClientsTo` enum
- rework JSON (de)serialization
- set `discoverDeviced` to `true` by default

### Added

- support multiple Use Cases running on the same entity
- add `ScaledNumberWrapper` for convenient management of the ubiquitous
  `ScaledNumber` data type
- implement `DeviceClassificationFeature`
- implement `TimeSeriesFeature`
- option to automatically log device discovery information for remote devices
- add `RequestResult#getResultData` for conveniently accessing query results
- add integration tests using jEEBus.SHIP

### Fixed

- fix KeyValue `DataUpdateTransactions`
- fix potential merging exceptions in `UseCaseDiscoveryWrapper`
- fix potential faiure at deserializing SPINE messages
- fix serialization of `FilterTypes` yet again
- fix `LoadControl` constraint validation

## [3.1.0] - 2025-06-26

### Changed

- make SPINE Devices, Entities, Features, Functions and Use Cases `AutoClosable`

### Added

- configuration wether to automatically start SHIP clients on detection
- logic for dealing with multiple server features with the same featureType on the same entity

### Fixed

- exclude device field from entityAddresses in DetailedDiscovery as per specification

## [3.0.0] - 2025-02-11

_First Open-Source Release under the AGPL_

### Changed

- rework `DeviceBuilder` and `ShipCommunication` for coherent API
- improve heartbeat schedule handling
- change boolean getter names from `is` to `get`

### Added

- fully automated, streamlined and robust remote device discovery process
  - includes reading and filtering of DetailedDiscovery and UseCaseDiscovery
  - includes automatic resolution of scenario presence indicators
  - introduces a developer-friendly use case listener interface
- human-readable logging of all SPINE messages
- API for sending fire-and-forget messages
- ability to build SPINE devices without immediately connecting them to SHIP

### Fixed

- fix acknowledgement handling
- fix serialization of `FilterTypes`
- stop notifying on unsuccessful write commands
- fix wrongly generated timestamps
- fix a bug causing remote SHIP clients to be trusted wrongly

## [2.0.0] - 2024-06-21

### Changed

- overhaul java code generation from SPINE XSD files
  - add fluent builder API
  - support cloning and copying
  - support deep equals
  - support hash codes
  - improve string representations
  - add complete value constructors

### Added

- implement SPINE v1.3.0_final
- automate abstract Feature / FeatureFunction logic:
  - validation of FeatureFunction data
  - filtering of data via Selectors and Elemet
  - handling of `READ` / `WRITE` commands
  - handling of notifications

### Fixed

- fix handling of Selectors in `FilterType`

## [1.1.0] - 2024-04-16

### Changed

- start DeviceDiscovery at SHIP Connection Data Exchange State
- ignore unknown fields when deserializing from JSON
- improve handling of commands on nonexistent functions
- enforce new package naming: `org.openmuc.jeebus.spine`

### Added

- implement SPINE v1.3.0_beta1
- support JSON Serialization of SPINE Messages

### Fixed

- fix exception messages in acknowledgements
  - include spine error in spine exception message
- fix element order in json serialization

## [1.0.0] - 2022-03-08

_Initial Release._

### Added

- implement SPINE v1.1.1
- support Acknowledgments
- support All message types like Read, Reply, Write, Notify, Call, Result
- support FeaturePermissions
  - support Binding and Subscription with access control
- support DetailedDiscovery
- support UseCaseDiscovery
