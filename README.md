# 📘 Issue Tracker Console Application

## 📄 Description
A Java console application that manages `bug` and `task` issues to demonstrate core OOP principles: **inheritance**, **abstraction**, **interface-based polymorphism**, and **method overriding**. It uses a `List<Issue>` to store mixed objects and interface casting to call `reportstatus()` uniformly.

---

## 🧩 Components
- **IssueTrackerApplication.java** – Main class; creates `bug` and `task` objects, adds them to a list, then displays and reports them.  
- **Issue (Base Class)** – Implements `Reportable`; contains common fields (`id`, `title`, `desc`, `raisedPerson`, `status`), a `display()` method, and a default (no-op) `reportstatus()` to be optionally overridden.  
- **bug (Subclass of Issue)** – Adds `severity`; overrides `reportstatus()` to display severity-specific status.  
- **task (Subclass of Issue)** – Adds fields like `assignedTo` and `dueDate`; overrides `reportstatus()` to show assignment and status details.  
- **Reportable (Interface)** – Declares the `reportstatus()` method, ensuring consistent status-reporting capabilities across all issue types. Interfaces promote loose coupling and code extensibility.

---

## 🎯 Purpose
To demonstrate fundamental Java OOP and design concepts by:  
- Using **inheritance** to share behavior between issues and their subtypes.  
- Applying **method overriding** for polymorphic behavior.  
- Leveraging **interface-based polymorphism** through the `Reportable` interface.  
- Managing heterogeneous objects with Java Collections (`List<Issue>`) and iterating through mixed types.

---

## 🏗️ Design Highlights
- **Interface implementation in base class**: `Issue` implements `Reportable` with a default no-op method, allowing subclasses to override as needed.  
- **Run-time polymorphism**: Calling `reportstatus()` on `Reportable` references dynamically invokes the correct subclass method.  
- **Collections & casting**: Uses `List<Issue>` to process different object types uniformly, illustrating type abstraction and iteration across mixed instances.

---

## 👤 Author
**Name:** Lokeshwaran M  
**Email:** lokeshwaran.m@epssw.com  
**Date:** July 2025
