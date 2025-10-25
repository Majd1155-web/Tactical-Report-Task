# Item Management Application

Full-stack web application for managing items with CRUD operations.

## Tech Stack

### Backend
- Spring Boot 3.x
- MongoDB
- Gradle
- MapStruct
- Lombok

### Frontend
- Next.js (Coming soon)
- TypeScript
- Tailwind CSS

## Features

- Create, Read, Update, Delete items
- Input validation
- Centralized error handling
- RESTful API design
- Docker containerization

## Getting Started

### Prerequisites
- Java 21
- Docker Desktop
- Node.js 18+

### Running the Backend

1. Start MongoDB:
```bash
docker run -d --name mongodb -p 27017:27017 mongo:latest
```

2. Run the application:
```bash
./gradlew bootRun
```

The API will be available at `http://localhost:8080`

### API Endpoints

- `POST /api/items` - Create a new item
- `GET /api/items` - Get all items
- `GET /api/items/{id}` - Get item by ID
- `PUT /api/items/{id}` - Update an item
- `DELETE /api/items/{id}` - Delete an item

## Docker

Coming soon...

## Project Structure
```
├── src/
│   └── main/
│       └── java/
│           └── com/Tactical/Report/Task/demo/
│               ├── controller/
│               ├── service/
│               ├── repository/
│               ├── model/
│               ├── DTO/
│               ├── Mapper/
│               ├── exception/
│               └── helperClasses/
├── build.gradle
└── README.md
```

## Author

[Your Name]
```

---

## **Step 3: Open GitHub Desktop**

1. **Open GitHub Desktop** application
2. **Click "File" → "Add Local Repository"**
3. **Click "Choose..."** and navigate to your project folder
4. You'll get a message: **"This directory does not appear to be a Git repository"**
5. **Click "create a repository"**

### **Initialize Repository Settings:**

- **Name:** (auto-filled from folder name)
- **Description:** `Full-stack item management application`
- **Git Ignore:** Select **"Java"** from dropdown (or keep your custom .gitignore)
- **License:** None (or choose MIT if you want)
- **Initialize this repository with a README:** ❌ **Uncheck** (we already have one)

6. **Click "Create Repository"**

---

## **Step 4: Make Your First Commit**

You should now see all your files listed in GitHub Desktop.

1. **Review the changes** - you'll see all your project files
2. In the **Summary field** (bottom left), type:
```
Initial commit - Spring Boot backend
```
3. In the **Description field** (optional), type:
```
- Complete REST API with CRUD operations
- MongoDB integration
- Input validation and error handling
- MapStruct for DTO mapping
```
4. **Click "Commit to main"**

---

## **Step 5: Publish to GitHub**

1. **Click "Publish repository"** button (top right)
2. A dialog appears:
   - **Name:** (auto-filled)
   - **Description:** (auto-filled)
   - **Keep this code private:** ✅ Check if you want private, or uncheck for public
3. **Click "Publish repository"**

GitHub Desktop will upload your code to GitHub!

---

## **Step 6: Verify on GitHub**

1. **Click "View on GitHub"** button in GitHub Desktop
2. Your browser opens showing your repository
3. You should see:
   - All your source code
   - README.md displayed
   - Commit history

---

## **Step 7: Future Commits (After Making Changes)**

Whenever you make changes:

1. **Open GitHub Desktop**
2. **Review changed files** (left panel shows what changed)
3. **Write commit message:**
   - Summary: `Add frontend authentication`
   - Description: Details about what you changed
4. **Click "Commit to main"**
5. **Click "Push origin"** (top right) to upload to GitHub

---

## **Typical Commit Messages for Your Project:**

As you continue, use clear commit messages:
```
✅ Initial commit - Spring Boot backend
✅ Add exception handling and validation
✅ Add Next.js frontend with authentication
✅ Implement items list and create pages
✅ Add item details and update functionality
✅ Add delete item functionality
✅ Create Dockerfiles for backend and frontend
✅ Add docker-compose.yml
✅ Update README with complete documentation
✅ Final testing and bug fixes
```

---

## **Project Structure on GitHub:**

After pushing, your repo should look like:
```
spring-boot-nextjs-item-management/
├── .gitignore
├── README.md
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/
└── src/
└── main/
├── java/
│   └── com/Tactical/Report/Task/demo/
└── resources/
└── application.properties
```

Later you'll add:
```
├── frontend/          (Next.js app)
├── Dockerfile         (Backend Docker)
└── docker-compose.yml