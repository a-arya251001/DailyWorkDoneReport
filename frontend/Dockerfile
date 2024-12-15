
# # ############################################
# # # Frontend Dockerfile (Development Version) #
# # ############################################

# # # Frontend Dockerfile
# # FROM node:22.12.0

# # # Set the working directory in the container
# # WORKDIR /app

# # # Copy only package.json and package-lock.json for efficient caching
# # COPY package*.json ./

# # # Install dependencies
# # #RUN npm install vite@latest
# # RUN npm install

# # # Copy the rest of the application
# # COPY . .
# # #RUN npm run dev
# # #EXPOSE 5173
# # # Start the development server
# # #CMD ["npm", "run", "dev"]


# # RUN npm run build
# # EXPOSE 5173
# # CMD ["npm", "run", "preview", "--", "--host", "0.0.0.0", "--port", "5173"]


# Frontend Dockerfile
FROM node:22.12.0

# Set the working directory in the container
WORKDIR /app

# Copy only package.json and package-lock.json for efficient caching
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application
COPY . .
EXPOSE 5173
# Start the development server
CMD ["npm", "run", "dev"]
