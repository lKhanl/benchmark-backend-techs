# Base image
FROM node:14

# Set working directory
WORKDIR /app

# Copy package.json and package-lock.json to work directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy application code to work directory
COPY . .

# Expose port 4000
EXPOSE 4000

# Start the application
CMD ["npm", "start"]
