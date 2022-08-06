FROM node:16
 
WORKDIR /usr/src/app
 
COPY package*.json ./

# TODO: Add install/setup for tailwindcss 
RUN npm install
# run this in terminal to update css build classes 
# npx tailwindcss -i ./src/input.css -o ./dist/output.css  

# Do I need to remove node_modules?
COPY . ./
# NOTE:  Nginx proxy will re-map ports
EXPOSE 3000

CMD [ "npm", "start" ]
