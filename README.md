# SWE 326 - Phase 3: Unit Testing - Cruise Control System

## 📌 Project Overview
This project is part of SWE 326: Software Testing. In Phase 3, we developed and executed unit tests for a Java-based **Cruise Control System** using **JUnit** and **EclEmma**.

---

## ✅ Phase 3 Objectives
- Design unit test cases for individual components of the system.
- Execute all unit tests using JUnit.
- Measure code coverage using EclEmma.
- Document all findings in the Master Test Plan.

---

## 👥 Team Members & Task Distribution
| Role                    | Member   | Responsibilities                                                                                                                                                                                                                    |
| ----------------------- | -------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 🔧 **Test Developer A** | Person 1 | <ul><li>Owns 1/3 of the source code (e.g., `CruiseControl.java`)</li><li>Writes JUnit test class: `CruiseControlTest.java`</li><li>Follows shared template and naming conventions</li><li>Pushes code via personal branch</li></ul> |
| 🔧 **Test Developer B** | Person 2 | <ul><li>Owns another 1/3 of code (e.g., `SpeedManager.java`)</li><li>Creates and pushes `SpeedManagerTest.java`</li><li>Reviews Pull Requests for consistency</li><li>Coordinates naming conventions if needed</li></ul>            |
| 🔧 **Test Developer C** | Person 3 | <ul><li>Owns final 1/3 (e.g., `BrakeSystem.java`)</li><li>Implements `BrakeSystemTest.java`</li><li>Runs all tests after merge</li><li>Uses **EclEmma** to collect code coverage screenshots</li></ul>                              |


| Task                                   | Assigned To           | Details                                                             |
| -------------------------------------- | --------------------- | ------------------------------------------------------------------- |
| **Test Plan Documentation (Step 3-1)** | Dev A or rotate       | Write test descriptions & expected outcomes in the Master Test Plan |
| **Test Execution Report (Step 3-2)**   | Dev B                 | Compile test result tables (Pass/Fail, actual outcomes)             |
| **Coverage Reporting (Step 3-3)**      | Dev C                 | Capture and annotate EclEmma screenshots; summarize coverage stats  |
| **Final Master Test Plan**             | Dev A or all together | Combine all reports, screenshots, and format for submission         |


---

## 📁 Folder Structure
/src/ # Original source code
/test/ # JUnit test classes
├── CruiseControlTest.java
├── SpeedManagerTest.java
└── BrakeSystemTest.java
/screenshots/ # Execution and coverage screenshots
/docs/ # Master Test Plan and documentation
└── Master-Test-Plan.docx


---

## 🛠️ Tools Used
- **JUnit 5** for writing and executing unit tests
- **EclEmma** (JaCoCo) for code coverage analysis
- **Eclipse IDE**
- **Git & GitHub** for collaboration

---

## 📄 Deliverables (Due: May 11, 2025)
- Master Test Plan (including Phase 1, 2, and 3)
- JUnit test classes
- Coverage and test result screenshots

---

## 📬 Submission Instructions
1. Ensure all content is merged into the `main` branch.
2. Verify formatting of the final Master Test Plan.
3. Submit the full project report as a single document.

---
