const vscode = require('vscode');

exports.run = async () => {
  console.log("runTests.js: run started");
  // Execute and await any VS Code commands that should be run before the tests start.
  // (E.g. activating an extension, opening a file, etc.)
  // await vscode.commands.executeCommand('some.command');
  return vscode.commands.executeCommand(
    'joyride.runCode',
    `(require '[seatbelt.runner :as runner])
     (runner/watch!+ "Waiting for workspace to activate...")`
  );
};
